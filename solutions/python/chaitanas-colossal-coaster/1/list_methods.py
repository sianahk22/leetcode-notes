"""Functions to manage and organize queues at Chaitana's roller coaster."""


def add_me_to_the_queue(express_queue, normal_queue, ticket_type, person_name):
    """Add a person to the 'express' or 'normal' queue depending on the ticket number.

    Parameters:
        express_queue (list): The names in the Fast-track queue.
        normal_queue (list): The names in the normal queue.
        ticket_type (int): Type of ticket. 1 = express, 0 = normal.
        person_name (str): The name of person to add to a queue.

    Returns:
        list: The (updated) queue the name was added to.
    """
    if ticket_type == 1:
        express_queue.append(person_name)
        return express_queue
    else:
        normal_queue.append(person_name)
        return normal_queue
        
   


def find_my_friend(queue, friend_name):
    """Search the queue for a name and return their queue position (index).

    Parameters:
        queue (list): The names in the queue.
        friend_name (str): The name of friend to find.

    Returns:
        int: The index at which the friends name was found.
    """
    if friend_name in queue:
        return queue.index(friend_name)
        

    


def add_me_with_my_friends(queue, index, person_name):
    queue.insert(index, person_name)
    return queue
   

   


def remove_the_mean_person(queue, person_name):
     if person_name in queue:
        queue.remove(person_name) 
     return queue
        
   
    

    

def how_many_namefellows(queue, person_name):
    return  queue.count(person_name)
      
    

    


def remove_the_last_person(queue):
    retir = queue.pop(-1)
    return retir  


def sorted_names(queue):
    return sorted(queue) 
    
