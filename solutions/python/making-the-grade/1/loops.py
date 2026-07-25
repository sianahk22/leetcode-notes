"""Functions for organizing and calculating student exam scores."""


def round_scores(student_scores):
    result = []
    for floats in student_scores:
        interval = round(floats)
        result.append(interval)
    return result    
  

def count_failed_students(student_scores):
    i = 0
    for student in student_scores:
        if student <= 40:
            i += 1
    return i         
            
   

def above_threshold(student_scores, threshold):
    meilleures_notes = []
    for student in student_scores:
        if student >= threshold:
            meilleures_notes.append(student)
    return meilleures_notes       
           
            
  

def letter_grades(highest):
    step = (highest - 40)//4
    return list(range(41,41+step*4,step))
    
     


def student_ranking(student_scores, student_names):
    classement = []
    for i in range(len(student_names)):
        rang = i+1
        nom = student_names[i]
        note = student_scores[i]
        phrase = f"{rang}. {nom}: {note}"
        classement.append(phrase)
    return classement    
        
    


def perfect_score(student_info):
    for i in range(len(student_info)):
       nom = student_info[i][0]
       note = student_info[i][1]
       if note == 100:
           return student_info[i]
    return []

          
    
    
    
    
    
   